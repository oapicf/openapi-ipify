import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';


@Injectable()
export abstract class DefaultApi {

  abstract getIp(format: 'json' | 'jsonp' | undefined, callback: string | undefined,  request: Request): string | Promise<string> | Observable<string>;

} 