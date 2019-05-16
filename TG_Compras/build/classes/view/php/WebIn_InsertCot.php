<?php

define('DB_NAME', 'BD_TG_Gabriel');
define('DB_USER', 'GABRIEL');
define('DB_PASSWORD', 'GABRIEL');
define('DB_HOST', 'localhost/XE');

$conn = oci_connect(DB_USER, DB_PASSWORD, DB_HOST);

if (!$conn){
	$e = oci_error();
	trigger_error(htmlentities($e['Erro'], ENT_QUOTES), E_USER_ERROR);
	die();
}
else echo "connection sucessful";

$codMat = 123 ;//$_POST['codMat'];
$cnpj = 123456781234 ;//$_POST['cnpj'];
$data = date('d/m/Y');		/*Mudar para procedura/trigger que insere data a partir do BD (PHP não trata HORA em conversão de data)*/

/*Iniciando inserção de Cotação(Status: Solicitada/Em Aberto)*/
//https://forum.imasters.com.br/topic/440128-preencher-formul%C3%A1rio-com-dados-obtidos-no-mysql/
$sql = "INSERT INTO tbl_Cotacao (NumCotacao, NumSolicitacao, DataCotacao, CNPJ, CodMaterial, SituacaoCotacao) 
	VALUES (7771, 7777, '$data', '$cnpj', '$codMat', 'Em Aberto')";
/*NumCotacao NUMBER(7),
  NumSolicitacao NUMBER(5),
  DataCotacao VARCHAR2(10),  --mudou
  CNPJ VARCHAR2(14),
  CodMaterial NUMBER(5), -- mudou
  PrecoUnitario NUMBER(5, 2), 
  SituacaoCotacao VARCHAR2(15)  -- mudou

$result = oci_parse($conn,$sql);
if (!$result) {
	$e = oci_error();
	trigger_error(htmlentities($e['Erro'], ENT_QUOTES), E_USER_ERROR);
	die();
}
else echo "insert sucessful";*/

oci_close($conn);
?>