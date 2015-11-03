<?php
session_start();
$name = md5($file).".jpg";
header('Content-type: image/jpeg');
$text = "qwertyuioplkjhgfdsazxcvbnm1234567890";
$st = str_shuffle($text);
$text1 = substr($st,0,5);
$_SESSION["vercode"] = $text1;
$height = 25;
$width = 65;
$image_p = imagecreate($width, $height);
$black = imagecolorallocate($image_p, 0, 0, 0);
$white = imagecolorallocate($image_p, 255, 255, 255);
$font_size = 14;
imagestring($image_p, $font_size, 5, 5, $text1, $white);
imagejpeg($image_p, null, 80);
imagejpeg($image_p, 'simpletext.jpg');
?>

