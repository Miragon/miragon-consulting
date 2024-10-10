/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.miragon.libs.taskmanager.client.apis

import com.fasterxml.jackson.annotation.JsonProperty

import org.springframework.web.client.RestClient
import org.springframework.web.client.RestClientResponseException

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.http.ResponseEntity
import org.springframework.http.MediaType


import io.miragon.libs.taskmanager.client.models.MetadataDto
import io.miragon.libs.taskmanager.client.infrastructure.*

class LoadMetadataControllerApi(client: RestClient) : ApiClient(client) {

    constructor(baseUrl: String) : this(RestClient.builder()
        .baseUrl(baseUrl)
        .messageConverters { it.add(MappingJackson2HttpMessageConverter()) }
        .build()
    )


    @Throws(RestClientResponseException::class)
    fun loadMetadata(): MetadataDto {
        val result = loadMetadataWithHttpInfo()
        return result.body!!
    }

    @Throws(RestClientResponseException::class)
    fun loadMetadataWithHttpInfo(): ResponseEntity<MetadataDto> {
        val localVariableConfig = loadMetadataRequestConfig()
        return request<Unit, MetadataDto>(
            localVariableConfig
        )
    }

    fun loadMetadataRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "*/*"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rest/metadata",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

}
