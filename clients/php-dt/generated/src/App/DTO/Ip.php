<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Ip
{
    /**
     * @DTA\Data(field="ip")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ip = null;

}
