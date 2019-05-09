<?php
$username = 'GABRIEL';
$password = 'GABRIEL';
$connection_string = 'localhost/XE';

$conn = oci_connect(
	$username,
	$password,
	$connection_string
);

if (!$conn){
	$e=oci_error();
	echo 'Error: '.$e["message"];
	die();
}
else
	echo 'Opa!! Oracle DB + PHP funfando';

oci_close($conn);
?>