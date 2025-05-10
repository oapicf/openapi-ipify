# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def get_ip(
        self,
        format: Annotated[Optional[StrictStr], Field(description="Response format")],
        param_callback: Annotated[Optional[StrictStr], Field(description="JSONP callback function name")],
    ) -> str:
        ...
