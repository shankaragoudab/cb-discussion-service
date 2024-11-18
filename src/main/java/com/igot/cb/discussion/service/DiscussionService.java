package com.igot.cb.discussion.service;

import com.igot.cb.pores.elasticsearch.dto.SearchCriteria;
import com.igot.cb.pores.util.ApiRespParam;
import com.fasterxml.jackson.databind.JsonNode;
import com.igot.cb.pores.util.ApiResponse;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface DiscussionService {
    ApiResponse createDiscussion(JsonNode discussionDetails, String token);

    ApiResponse readDiscussion(String discussionId);

    ApiResponse updateDiscussion(JsonNode updateData,String token);

    ApiResponse searchDiscussion(SearchCriteria searchCriteria);

    ApiResponse deleteDiscussion(String discussionId,String token);

    ApiResponse updateUpVote(Map<String,Object> upVoteData, String token);
}