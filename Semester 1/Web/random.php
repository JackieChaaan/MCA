<?php
$a = 6;
for ($i = 0; $i < $a; $i++) {
    $n[] = rand(0, 100);
}
?>
<html>
    <head>
        <title>Random Generator</title>
    </head>
    <body>
        <p>
        <h4>Random number generated are</h4>
        <?php foreach ($n as $num): ?>
            <span><?php echo $num; ?></span><br>
        <?php endforeach; ?>
        </p>
</body>
</html>

