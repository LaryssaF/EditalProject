const express = require('express');
const bodyParser = require('body-parser');
const { Pool } = require('pg');

const app = express();

app.use(bodyParser.json());


const pool = new Pool({
  user: 'postgres',
  host: 'localhost',
  database: 'mydatabase',
  password: 'mypassword',
  port: 5432,
});

app.post('/edital-inovacao', async (req, res) => {
  try {
    const { titulo, descricao, prazo, criteriosSelecao, requisitos } = req.body;

    
    const sql = 'INSERT INTO tabela_edital_inovacao (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES ($1, $2, $3, $4, $5)';
    const values = [titulo, descricao, prazo, criteriosSelecao, requisitos];
    await pool.query(sql, values);

    res.status(201).json({ message: 'Edital de inovação cadastrado com sucesso.' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: 'Erro ao cadastrar edital de inovação.' });
  }
});


app.post('/edital-pesquisa', async (req, res) => {
  try {
    const { titulo, descricao, prazo, criteriosSelecao, requisitos } = req.body;


    const sql = 'INSERT INTO tabela_edital_pesquisa (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES ($1, $2, $3, $4, $5)';
    const values = [titulo, descricao, prazo, criteriosSelecao, requisitos];
    await pool.query(sql, values);

    res.status(201).json({ message: 'Edital de pesquisa cadastrado com sucesso.' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: 'Erro ao cadastrar edital de pesquisa.' });
  }
});

app.post('/edital-extensao', async (req, res) => {
  try {
    const { titulo, descricao, prazo, criteriosSelecao, requisitos } = req.body;

    const sql = 'INSERT INTO tabela_edital_extensao (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES ($1, $2, $3, $4, $5)';
    const values = [titulo, descricao, prazo, criteriosSelecao, requisitos];
    await pool.query(sql, values);

    res.status(201).json({ message: 'Edital de extensão cadastrado com sucesso.' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: 'Erro ao cadastrar edital de pesquisa.' });
  }
});