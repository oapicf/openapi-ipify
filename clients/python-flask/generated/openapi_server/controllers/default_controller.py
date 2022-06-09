import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.ip import Ip  # noqa: E501
from openapi_server import util


def get_ip(format=None, param_callback=None):  # noqa: E501
    """Get your public IP address

     # noqa: E501

    :param format: Response format
    :type format: str
    :param param_callback: JSONP callback function name
    :type param_callback: str

    :rtype: Union[Ip, Tuple[Ip, int], Tuple[Ip, int, Dict[str, str]]
    """
    return 'do some magic!'
