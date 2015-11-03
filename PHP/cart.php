<html>
<body>
<?php
$_SESSION['total'] = 0;
if(isset($_POST['submit']))
{
	if(isset($_POST['shirt']))
		$_SESSION['total'] = $_SESSION['total'] + 200;
	if(isset($_POST['pant']))
		$_SESSION['total'] = $_SESSION['total'] + 400;
	echo "Your total is : ".$_SESSION['total'];
}
?>
<form method="POST" action ="">
Shirt (Rs. 200)<input type="checkbox" value="1" name="shirt">
Pant (Rs. 400)<input type="checkbox" value="1" name="pant">
<input type="submit" value="submit" name="submit">
</body>
</html>

