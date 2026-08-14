import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/')
  getIp(@Query('format') format: 'json' | 'jsonp' | undefined, @Query('callback') callback: string | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.defaultApi.getIp(format, callback, request);
  }

} 