<? php
$to="user123@example.com";
$sub="Test mail";
$message1 = "<h1>MIME mail</h1>This<br> is <br>a <br>sample <br>test <br>mail";
$headers = "MIME-Version: 1.0\r\n";
$headers .= "Content-type: text/html; charset=iso-8859-1\r\n";
$headers .= "Content-Transfer-Encoding: 7bit\r\n";
$mailsent = mail($to,$sub,$message1,$header);
if($mailsent)
    echo "the mail was sent to $to successfully";
else
    echo "mail was not sent";
?>
