package org.scoula.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("SELECT sysdate()") // 현재 시간
    public String getTime();

    // XML Mapper에 정의된 SQL과 매핑
    public String getTime2();
}
