package com.arch.raon.domain.dictionary.dto.query;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.redis.core.ZSetOperations;

@Getter
public class DictionaryMyRankQueryDTO {
    private String ranker;
    private int score;

    public DictionaryMyRankQueryDTO() {
    }

    @Builder
    public DictionaryMyRankQueryDTO(String ranker, double score) {
        this.ranker = ranker;
        this.score = (int) score;
    }

    public static DictionaryMyRankQueryDTO convertToDictionaryMyRankQueryDTO(ZSetOperations.TypedTuple typedTuple){
        DictionaryMyRankQueryDTO dictionaryMyRankQueryDTO=new DictionaryMyRankQueryDTO();
        dictionaryMyRankQueryDTO.ranker = typedTuple.getValue().toString();
        dictionaryMyRankQueryDTO.score=typedTuple.getScore().intValue();
        return dictionaryMyRankQueryDTO;
    }
}
