CREATE TABLE enderecos(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
idUsuario INTEGER,
cep char(8) NOT NULL,
logradouro VARCHAR(100) NOT NULL,
numero VARCHAR(6) NOT NULL,
estado CHAR(2) NOT NULL,
bairro VARCHAR(40)NOT NULL,
cidade VARCHAR(30) NOT NULL,
complemento VARCHAR(50)
);