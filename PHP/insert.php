<html>
<body>
<?php
if(isset($_POST['submit'])){
	$con = mysql_connect("localhost","root","null")or die("Could not connect");	
	mysql_select_db("anurag");
	echo "connected";
	$student_id = $_POST['id'];
	$name = $_POST['name'];
	$major = $_POST['major'];
	$total = $_POST['total'];
	$grade = $_POST['grade'];	
	$sql = "INSERT into student values ('".$student_id."','".$name."','".$major."','".$total."','".$grade."')";
	//$sql = "INSERT INTO student values(10,'Anuragt','IT',890,'S')";
	$m = mysql_query($sql, $con);	
	if($m)
		echo "Inserted";
	else
		echo "Not Inserted";
}
?>

<form action="insert.php" method = "POST">
<input type="text" name ="id"> id
<input type="text" name ="name"> name
<input type="text" name ="major"> major
<input type="text" name ="total"> total
<input type="text" name ="grade"> grade
<input type = "submit" name ="submit" value ="submit">
</form>
<html>

