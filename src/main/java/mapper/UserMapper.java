package mapper;

import java.util.List;

import pojo.QueryVo;
import pojo.Stu;

public interface UserMapper {
	public List<Stu> selectAll();
	public List<Stu> selectOne(QueryVo vo);
}
