package com.simpletech.webanalytics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.simpletech.webanalytics.model.ShareLinePoint;
import com.simpletech.webanalytics.dao.base.BaseDaoMybatisMYSQLImpl.MybatisMultiDao;


/**
 * 数据库表t_share_line_point的mapper接口
 * @author 树朾
 * @date 2015-12-11 18:11:55 中国标准时间
 */
public interface ShareLinePointMapper extends MybatisMultiDao<ShareLinePoint>{

	/**
	 * 插入一条新数据
	 * @param model 添加的数据
	 * @return 改变的行数
	 */
	@Insert("INSERT INTO t_share_line_point ( id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point , share_to , count_pv , share_span , share_time , create_time , update_time ) VALUES ( #{id} , #{idsite} , #{idsubsite} , #{idurl} , #{idtitle} , #{idvisitor} , #{idrefervisitor} , #{isStartPoint} , #{shareTo} , #{countPv} , #{shareSpan} , #{shareTime} , #{createTime} , #{updateTime} )")
	int insert(ShareLinePoint model);
	/**
	 * 根据ID删除
	 * @param id 数据的主键ID
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_share_line_point WHERE id=#{id}")
	int delete(@Param("id") Object id);
	/**
	 * 更新一条数据
	 * @param model 更新的数据
	 * @return 改变的行数
	 */
	@Update("UPDATE t_share_line_point SET id=#{id} , idsite=#{idsite} , idsubsite=#{idsubsite} , idurl=#{idurl} , idtitle=#{idtitle} , idvisitor=#{idvisitor} , idrefervisitor=#{idrefervisitor} , is_start_point=#{isStartPoint} , share_to=#{shareTo} , count_pv=#{countPv} , share_span=#{shareSpan} , share_time=#{shareTime} , create_time=#{createTime} , update_time=#{updateTime} WHERE id=#{id} ")
	int update(ShareLinePoint model);
	/**
	 * 统计全部出数据
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM t_share_line_point")
	int countAll();
	/**
	 * 根据ID获取
	 * @param id 主键ID
	 * @return null 或者 主键等于id的数据
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point WHERE id=#{id}")
	ShareLinePoint findById(@Param("id") Object id);
	/**
	 * 获取全部数据
	 * @return 全部数据列表
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point ${order}")
	List<ShareLinePoint> findAll(@Param("order") String order);
	/**
	 * 分页查询数据
	 * @param limit 最大返回
	 * @param start 起始返回
	 * @return 分页列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point ${order} LIMIT ${start},${limit}")
	List<ShareLinePoint> findByPage(@Param("order") String order,@Param("limit") int limit,@Param("start") int start);
	/**
	 * 选择性删除
	 * @param where SQL条件语句
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_share_line_point ${where}")
	int deleteWhere(@Param("where") String where);
	/**
	 * 根据属性值删除
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_share_line_point WHERE ${propertyName}=#{value}")
	int deleteByPropertyName(@Param("propertyName") String propertyName,@Param("value") Object value);
	/**
	 * 选择性统计
	 * @param where SQL条件语句
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM t_share_line_point ${where}")
	int countWhere(@Param("where") String where);
	/**
	 * 根据属性统计
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM WHERE ${propertyName}=#{value}")
	int countByPropertyName(@Param("propertyName") String propertyName,@Param("value") Object value);
	/**
	 * 选择性查询
	 * @param where SQL条件语句
	 * @return 符合条件的列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point ${where} ${order}")
	List<ShareLinePoint> findWhere(@Param("order") String order,@Param("where") String where);
	/**
	 * 选择性分页查询
	 * @param where SQL条件语句
	 * @param limit 最大返回
	 * @param start 起始返回
	 * @return 符合条件的列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point ${where} ${order} LIMIT ${start},${limit}")
	List<ShareLinePoint> findWhereByPage(@Param("order") String order,@Param("where") String where,@Param("limit") int limit,@Param("start") int start);
	/**
	 * 根据属性查询
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 返回符合条件的数据列表
	 */
	@Select("SELECT id , idsite , idsubsite , idurl , idtitle , idvisitor , idrefervisitor , is_start_point isStartPoint , share_to shareTo , count_pv countPv , share_span shareSpan , share_time shareTime , create_time createTime , update_time updateTime FROM t_share_line_point WHERE ${propertyName}=#{value} ${order}")
	List<ShareLinePoint> findByPropertyName(@Param("order") String order,@Param("propertyName") String propertyName,@Param("value") Object value);
}