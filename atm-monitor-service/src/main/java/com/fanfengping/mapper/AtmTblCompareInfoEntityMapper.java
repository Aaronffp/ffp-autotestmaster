package com.fanfengping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fanfengping.entity.AtmTblCompareInfoEntity;

public interface AtmTblCompareInfoEntityMapper {
    @Insert("insert into atm_tbl_compare_info (tbl_comp_flag, tbl_comp_result, tbl_comp_name_eng, tbl_comp_benchmark_no, tbl_comp_benchmark_env, tbl_comp_benchmark_url, "
            + "tbl_comp_target_no, tbl_comp_target_env, tbl_comp_target_url, tbl_comp_info, tbl_comp_note) "
            + "values (#{tblCompFlag}, #{tblCompResult}, #{tblCompNameEng}, #{tblCompBenchmarkNo}, #{tblCompBenchmarkEnv}, #{tblCompBenchmarkUrl}, "
            + "#{tblCompTargetNo}, #{tblCompTargetEnv}, #{tblCompTargetUrl}, #{tblCompInfo}, #{tblCompNote})")
    @Results({
//      @Result(property = "tblCompNo", column = "tbl_comp_no"),
        @Result(property = "tblCompFlag", column = "tbl_comp_flag"),
        @Result(property = "tblCompResult", column = "tbl_comp_result"),
        @Result(property = "tblCompNameEng", column = "tbl_comp_name_eng"),
        @Result(property = "tblCompBenchmarkNo", column = "tbl_comp_benchmark_no"),
        @Result(property = "tblCompBenchmarkEnv", column = "tbl_comp_benchmark_env"),
        @Result(property = "tblCompBenchmarkUrl", column = "tbl_comp_benchmark_url"),
        @Result(property = "tblCompTargetNo", column = "tbl_comp_target_no"),
        @Result(property = "tblCompTargetEnv", column = "tbl_comp_target_env"),
        @Result(property = "tblCompTargetUrl", column = "tbl_comp_target_url"),
        @Result(property = "tblCompInfo", column = "tbl_comp_info"),
        @Result(property = "tblCompNote", column = "tbl_comp_note"),
//      @Result(property = "tblCompTime", column = "tbl_comp_time"),
    })
    void add(AtmTblCompareInfoEntity atmTblCompareInfoEntity);
    
    @Select("select tbl_comp_no, tbl_comp_flag, tbl_comp_result, tbl_comp_name_eng, tbl_comp_benchmark_no, tbl_comp_benchmark_env, tbl_comp_benchmark_url, "
            + "tbl_comp_target_no, tbl_comp_target_env, tbl_comp_target_url, tbl_comp_info, tbl_comp_note, tbl_comp_time "
            + "from atm_tbl_compare_info")
    @Results({
        @Result(property = "tblCompNo", column = "tbl_comp_no"),
        @Result(property = "tblCompFlag", column = "tbl_comp_flag"),
        @Result(property = "tblCompResult", column = "tbl_comp_result"),
        @Result(property = "tblCompNameEng", column = "tbl_comp_name_eng"),
        @Result(property = "tblCompBenchmarkNo", column = "tbl_comp_benchmark_no"),
        @Result(property = "tblCompBenchmarkEnv", column = "tbl_comp_benchmark_env"),
        @Result(property = "tblCompBenchmarkUrl", column = "tbl_comp_benchmark_url"),
        @Result(property = "tblCompTargetNo", column = "tbl_comp_target_no"),
        @Result(property = "tblCompTargetEnv", column = "tbl_comp_target_env"),
        @Result(property = "tblCompTargetUrl", column = "tbl_comp_target_url"),
        @Result(property = "tblCompInfo", column = "tbl_comp_info"),
        @Result(property = "tblCompNote", column = "tbl_comp_note"),
        @Result(property = "tblCompTime", column = "tbl_comp_time"),
    })
    List<AtmTblCompareInfoEntity> findAll();

}
