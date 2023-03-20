<?php
$montant = 0; $res = 0;
if (isset($_POST['montant'])) {
    $montant = $_POST['montant'];
    $clientSoap = new SoapClient("http://localhost:9191/banqueService?wsdl"); 

    $param = new stdClass();
    $param->montant = $montant;
    $res = $clientSoap->__soapCall("convert",array($param));

}
?>

<html>
<body>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
Montant: <input type="text" name="montant" value="<?php echo($montant)?>"/>
            <input type="submit" value="ok">
</form>
<?php 
if(isset($res->return)){
    echo "Montant en euros: ".$res->return;
}
?>
</body>
</html>