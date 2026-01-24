import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { &#39;json&#39; | &#39;jsonp&#39;,  } from '../models';


@Injectable()
export abstract class DefaultApi {

  abstract getIp(format: 'json' | 'jsonp', callback: string,  request: Request): string | Promise<string> | Observable<string>;

} 