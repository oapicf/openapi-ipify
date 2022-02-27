<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/', function(Application $app, Request $request) {
            $format = $request->get('format');
            $callback = $request->get('callback');
            return new Response('How about implementing getIp as a GET method ?');
            });


$app->run();
