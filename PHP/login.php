<html>
<body>
<?php
if(isset($_COOKIE['user']))
{
echo "Your name is ".$_COOKIE['user'][0];
echo "Your password is ".$_COOKIE['user'][1];
}
?>
<?php
if(isset($_POST['submit']))
{
$name = $_POST['uname'];
$pass = $_POST['pass'];
$check = $_POST['check'];
if($check == "1")
{
setcookie("user[0]",$name,time()+86400,"/");
setcookie("user[1]",$pass,time()+86400,"/");
}
}
?>
<form method="POST" action="login.php">
Username <input type="text" name = "uname"><br>
Password <input type="password" name="pass"><br>
Remember Me<input type = "checkbox" value="1" name="check"><br>
<input type= "submit" value="Login" name="submit">
<form>
</body>
</html>
