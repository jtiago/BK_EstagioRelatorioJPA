-- Criação de Perfil
INSERT INTO perfil
(nomeperfil,cadastroAluno,cadastroCampo,cadastroSupervisor,cadastroTurma,liberarRelatorio,relatorioAluno,relatorioAdmin,revisaoRelatorio,cadastroUsuario,relatorioEnviado)
VALUES ('COORDENAÇÃO',1,1,1,1,1,0,1,0,1,0);

INSERT INTO perfil
(nomeperfil,cadastroAluno,cadastroCampo,cadastroSupervisor,cadastroTurma,liberarRelatorio,relatorioAluno,relatorioAdmin,revisaoRelatorio,cadastroUsuario,relatorioEnviado)
VALUES ('ALUNO',0,0,0,0,0,1,0,1,0,1);

INSERT INTO perfil
(nomeperfil,cadastroAluno,cadastroCampo,cadastroSupervisor,cadastroTurma,liberarRelatorio,relatorioAluno,relatorioAdmin,revisaoRelatorio,cadastroUsuario,relatorioEnviado)
VALUES ('SUPERVISOR',0,0,0,0,0,0,1,0,0,0);

-- Criação de Usuário
INSERT INTO usuario (cpfusuario,nomeusuario,senhausuario,fkperfil) VALUES ('22222222222', 'Arruda', 'MjI=', 1)