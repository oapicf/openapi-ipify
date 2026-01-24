import { Body, Controller, Get, Param, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { DefaultApi } from '../api';
import { &#39;json&#39; | &#39;jsonp&#39;,  } from '../models';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/')
  getIp(@Query('format') format: 'json' | 'jsonp', @Query('callback') callback: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.defaultApi.getIp(format, callback, request);
  }

} 