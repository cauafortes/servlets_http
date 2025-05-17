# 🌐 Servlets HTTP - Exemplo de Manipulação de Requisições

Este projeto demonstra o uso de Servlets Java com Jakarta EE para lidar com diferentes tipos de requisições HTTP, como leitura de cabeçalhos, manipulação de cookies, métodos HTTP, status da resposta e leitura do corpo da requisição.

## 📁 Servlets incluídos

### 🔍 `/headers` - HeaderAnalysisServlet
Exibe todos os cabeçalhos enviados na requisição HTTP e algumas informações adicionais:
- **IP do usuário**
- **Versão do protocolo HTTP**

### ✅ `/methods` - MethodsServlet
Responde ao método HTTP `OPTIONS` informando quais métodos são suportados:
GET, POST, PUT, DELETE, OPTIONS

yaml
Copiar
Editar

### 📨 `/request-body` - RequestBodyServlet
Recebe dados via `POST` e exibe:
- Parâmetros do formulário: `nome`, `email`, `mensagem`
- Corpo bruto da requisição (raw)

### 📡 `/status` - StatusServlet
Retorna um código de status HTTP baseado no parâmetro `code` recebido via URL.  
Exemplo: `/status?code=404` → resposta com status 404.  
Se inválido, retorna 400.

### 🍪 `/session` - SessionServlet
Trabalha com cookies:
- Se houver cookie chamado `usuario`, exibe mensagem personalizada.
- Se não houver, cria um cookie `usuario=usuarioX` com validade de 1 dia.
