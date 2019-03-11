package io.openems.edge.common.jsonapi;

import java.util.concurrent.CompletableFuture;

import io.openems.common.exceptions.OpenemsError.OpenemsNamedException;
import io.openems.common.jsonrpc.base.JsonrpcRequest;
import io.openems.common.jsonrpc.base.JsonrpcResponseSuccess;
import io.openems.common.session.User;

/**
 * Declares a class as being able to handle JSON-RPC Requests.
 */
public interface JsonApi {

	/**
	 * Handles a JSON-RPC Request.
	 * 
	 * @param user    the authenticated User
	 * @param request the JSON-RPC Request
	 * @return a Future JSON-RPC Success Response; null response results in a
	 *         OpenemsError.JSONRPC_UNHANDLED_METHOD
	 * @throws OpenemsNamedException on error
	 */
	public CompletableFuture<JsonrpcResponseSuccess> handleJsonrpcRequest(User user, JsonrpcRequest request)
			throws OpenemsNamedException;

}
