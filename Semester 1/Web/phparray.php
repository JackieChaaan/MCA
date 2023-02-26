<?php

$cars = array('tata', 'jaguar', 'volvo', 'bmw');
echo '<table border=1><tr><th>Name of car</th></tr>';
/*echo '<tr><td>' . $cars[0] . '</td></tr>';
echo '<tr><td>' . $cars[1] . '</td></tr>';
echo '<tr><td>' . $cars[2] . '</td></tr>';
echo '<tr><td>' . $cars[3] . '</td></tr></table>';*/
for($x=0;$x<count($cars);$x++)
{
    echo '<tr><td>' . $cars[$x] . '</td></tr>';
}
