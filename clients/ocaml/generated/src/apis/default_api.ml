(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let get_ip ?format ?callback () =
    let open Lwt in
    let uri = Request.build_uri "/" in
    let headers = Request.default_headers in
    let uri = Request.maybe_add_query_param uri "format" Enums.show_format format in
    let uri = Request.maybe_add_query_param uri "callback" (fun x -> x) callback in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Ip.of_yojson) resp body

