# 🧭 Aplicômetro

<p align="center">
  <!-- Status do build no GitHub Actions -->
  <a href="https://github.com/ViniciusAnholeto/aplicometro/actions/workflows/ci.yml">
    <img src="https://github.com/ViniciusAnholeto/aplicometro/actions/workflows/ci.yml/badge.svg" alt="Build Status">
  </a>

  <!-- Cobertura de testes (valor estático, pode atualizar depois com ferramenta real) -->
  ![Coverage](https://raw.githubusercontent.com/ViniciusAnholeto/aplicometro/main/.github/badges/coverage.svg)

  <!-- Linguagem principal -->
  <img src="https://img.shields.io/github/languages/top/ViniciusAnholeto/aplicometro" alt="Main language">

  <!-- Último commit -->
  <img src="https://img.shields.io/github/last-commit/ViniciusAnholeto/aplicometro" alt="Last commit">
</p>

O **Aplicômetro** é um sistema pessoal (e público) para organizar candidaturas a vagas de emprego.

Ele nasceu de uma dor real de quem está buscando uma recolocação no mercado: o caos que é tentar acompanhar dezenas de processos seletivos, estágios de entrevistas, mensagens de recrutadores e status indefinidos. O Aplicômetro vem para resolver isso de forma simples, prática e eficiente.

Quem sabe isso não vira um produto? 

Ou uma extensão pra navegador?

---

## ✨ Funcionalidades do MVP

- Cadastro manual de candidaturas
- Registro de candidaturas por:
    - Aplicação direta (LinkedIn, e-mail, plataforma)
    - Contato de recrutador
- Atualização de status da candidatura
- Comentários e observações por etapa
- Visualização de histórico de aplicações

---

## 🚀 Tecnologias Utilizadas

### Backend
- Java 21
- Spring Boot 3.5
- Maven
- PostgreSQL
- Docker & Docker Compose
- GitHub Actions (CI/CD)
- JaCoCo (cobertura de testes)

### Frontend
- Angular (em fase de aprendizado)

---

## 🧪 Qualidade e CI/CD

Este projeto utiliza:
- **Cobertura mínima de testes** validada com **JaCoCo**
- **Build automatizado com GitHub Actions**
- Deploy automático via Docker

---

## 📦 Como rodar localmente

### Pré-requisitos
- Java 21
- Docker e Docker Compose

### Subindo o ambiente

```bash
docker-compose -f docker-compose.yml -f docker-compose.override.yml up -d
