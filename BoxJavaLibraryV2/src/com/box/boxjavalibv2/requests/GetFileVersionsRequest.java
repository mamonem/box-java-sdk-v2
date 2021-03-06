package com.box.boxjavalibv2.requests;

import com.box.boxjavalibv2.requests.requestobjects.BoxDefaultRequestObject;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;
import com.box.restclientv2.interfaces.IBoxConfig;
import com.box.restclientv2.requests.DefaultBoxRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Request to get a file version.
 */
public class GetFileVersionsRequest extends DefaultBoxRequest {

    private static final String URI = "/files/%s/versions";

    /**
     * Constructor.
     * 
     * @param config
     *            config
     * @param objectMapper
     *            object mapper
     * @param fileId
     *            id of the file
     * @param requestObject
     *            request object
     * @throws BoxRestException
     *             exception
     */
    public GetFileVersionsRequest(final IBoxConfig config, final ObjectMapper objectMapper, final String fileId, BoxDefaultRequestObject requestObject)
        throws BoxRestException {
        super(config, objectMapper, getUri(fileId), RestMethod.GET, requestObject);
    }

    /**
     * Get uri.
     * 
     * @param fileId
     *            id of the file
     * @return uri
     */
    public static String getUri(final String fileId) {
        return String.format(URI, fileId);
    }
}
