<?php
/**
 * ipify
 * @version 0.9.0
 */

require_once __DIR__ . '/vendor/autoload.php';

use OpenAPIServer\SlimRouter;

$router = new SlimRouter();
$app = $router->getSlimApp();
$app->run();
