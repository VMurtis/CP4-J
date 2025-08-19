<img width="1597" height="856" alt="Captura de tela 2025-08-12 113226" src="https://github.com/user-attachments/assets/8f012fca-83af-4139-8528-4a74981c9499" />

---


###  Método

- **Método:** `POST`
- **URL:**  
  `http://localhost:8081/ferramenta`

---

#### Body (JSON):

```json
{
  "nomeFerramenta": "Chave de Fenda",
  "tipoFerramenta": "Manual",
  "tamanhoFerramenta": "Pequeno",
  "precoFerramenta": 25.90
}

```

###  Método

- **Método:** `PUT`
- **URL:**  
  `http://localhost:8081/ferramenta/{id}`

---

#### Body (JSON):

```json
{
  "nomeFerramenta": "Chave de Fenda",
  "tipoFerramenta": "Manual",
  "tamanhoFerramenta": "Pequeno",
  "precoFerramenta": 30.00


```

###  Método

- **Método:** `GET`
- **URL:**  
  `http://localhost:8081/ferramenta/{id}`

---

###  Método

- **Método:** `DELETE`
- **URL:**  
  `http://localhost:8081/ferramenta/{id}`

---

---


###  Método

- **Método:** `POST`
- **URL:**  
  `http://localhost:8081/fornecedor`

---

#### Body (JSON):

```json
{
  "nome": "Maxobra",
  "cnpj": "12345678000199",
  "email": "maxobra@empresa.com",
  "telefone": "(11) 99999-9999"
}


```

###  Método

- **Método:** `PATCH`
- **URL:**  
  `http://localhost:8081/fornecedor/{id}`

---

#### Body (JSON):

```json
{
  "email": "maxmail@empresa.com",
  "telefone": "(11) 98888-7777"
}

```

###  Método

- **Método:** `GET`
- **URL:**  
  `http://localhost:8081/fornecedor/{id}`

---

###  Método

- **Método:** `DELETE`
- **URL:**  
  `http://localhost:8081/fornecedor/{id}`

---

---


###  Método

- **Método:** `POST`
- **URL:**  
  `http://localhost:8081/cliente`

---

#### Body (JSON):

```json
{
  "nome": "Ana Silva",
  "cpf": "12345678900",
  "email": "anaSilva@email.com",
  "telefone": "1178787878"
}


```

###  Método

- **Método:** `PATCH`
- **URL:**  
  `http://localhost:8081/cliente/{id}`

---

#### Body (JSON):

```json
{
  "email": "silvaAna@email.com"
}


```

###  Método

- **Método:** `GET`
- **URL:**  
  `http://localhost:8081/cliente/{id}`

---

###  Método

- **Método:** `DELETE`
- **URL:**  
  `http://localhost:8081/cliente/{id}`

---


