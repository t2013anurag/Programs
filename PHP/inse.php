<html>
<?php
if(isset($_POST['submit'])){
	$student_id = $_POST['stuid'];
	$name = $_POST['name'];
	$major = $_POST['major'];
	$total = $_POST['total'];
	$grade = $_POST['grade'];
	$con = mysqli_connect('localhost','root','null');
	$db = "anurag";
	mysql_select_db($db,$con);
	$sql = "INSERT into student values ('".$student_id."','".$name."','".$major."','".$total."','".$grade."');";
	$m = mysql_query($sql, $con);
	if($m)
		echo "Inserted";
	else
		echo "Not Inserted";
	mysql_close($con);
}
?>
<body>
	<form action="inse.php" method="POST">
		Student Id: <input type="text" id="stuid" name="stuid">
		Name: <input type="text" id="name" name="name">
		Major: <input type="text" id="major" name="major">
		Total: <input type="text" id="total" name="total">
		Grade: <input type="text" id="grade" name="grade">
		<input type="submit" value="Submit" name="submit">
	</form>
</body>
</html>
