<?php
     if($_POST)
     {
          $p=array("1"=>$_POST['p1'],"2"=>$_POST['p2'],"3"=>$_POST['p3'],"4"=>$_POST['p4'],"5"=>$_POST['p5'],"6"=>$_POST['p6'],"7"=>$_POST['p7'],"8"=>$_POST['p8'],"9"=>$_POST['p9'],"10"=>$_POST['p10'],"11"=>$_POST['p11']);
          echo '<table border="2"><tr><th>SlNo</th><th>Name</th</tr>';
          foreach($p as $slno=>$pl){
            echo '<tr><td>'.$slno.'</td><td>'.$pl.'</td></tr>';
          }
          echo '</table>';
    }
?>