<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Ip
{
    /**
     * @DTA\Data(field="ip")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $ip;
}
