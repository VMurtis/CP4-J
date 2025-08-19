# Deploy da API CP4 no Render

## Pré-requisitos
- Conta no Render (gratuita)
- Projeto no GitHub

## Passos para Deploy

### 1. Preparar o Repositório
- Certifique-se de que o projeto está no GitHub
- Verifique se o arquivo `render.yaml` está na raiz do projeto

### 2. Configurar no Render
1. Acesse [render.com](https://render.com)
2. Faça login/cadastro
3. Clique em "New +" → "Web Service"
4. Conecte seu repositório GitHub
5. Selecione o repositório do projeto

### 3. Configurações do Serviço
- **Name**: cp4-api (ou o nome que preferir)
- **Environment**: Java
- **Build Command**: `./mvnw clean package -DskipTests`
- **Start Command**: `java -jar target/cp4-0.0.1-SNAPSHOT.jar`

### 4. Variáveis de Ambiente
Configure as seguintes variáveis de ambiente no Render:
- `JAVA_VERSION`: 21
- `PORT`: 8080
- `SPRING_DATASOURCE_URL`: URL do seu banco Oracle
- `SPRING_DATASOURCE_USERNAME`: Seu usuário
- `SPRING_DATASOURCE_PASSWORD`: Sua senha

### 5. Deploy
- Clique em "Create Web Service"
- Aguarde o build e deploy (pode demorar alguns minutos)

## URLs da API
Após o deploy, sua API estará disponível em:
- `https://cp4-api.onrender.com` (ou o nome que você escolheu)

## Endpoints Disponíveis
- `/api/clientes` - Gerenciamento de clientes
- `/api/ferramentas` - Gerenciamento de ferramentas  
- `/api/fornecedores` - Gerenciamento de fornecedores

## Observações
- O Render oferece SSL gratuito
- O serviço pode "dormir" após 15 minutos de inatividade
- Para evitar isso, considere o plano pago ou use serviços de ping
