<?php
header('Content-type: image/jpeg');
$image_p = imagecreate(200, 200);
$black = imagecolorallocate($image_p, 0, 0, 0);
$red = imagecolorallocate($image_p,255,0,0);
imagearc($image_p,100,100,150,150,25,155,$red);
imagearc($image_p,100,100,200,200,0,360,$red);
imagearc($image_p,60,75,50,50,0,360,$red);
imagearc($image_p,140,75,50,50,0,360,$red);
imagejpeg($image_p, null, 80);
?>
