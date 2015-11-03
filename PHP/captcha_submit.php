<?php
session_start();
if ($_POST["vercode"] != $_SESSION["vercode"] OR $_SESSION["vercode"]==' ')
 {
     echo "Incorrect verification code";
 }
 else {
     echo  '<strong>Verification successful.</strong>';
};
?>
