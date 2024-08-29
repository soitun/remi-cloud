package ai.remi.sys.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 职系表 GradeVO对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Schema(description = "职系表")
public class GradeVO implements Serializable {
    private static final long serialVersionUID = 323149759001139145L;
    /**
     * ID
     */
    @Schema(description = "ID")
    private String id;
    /**
     * 职系编码
     */
    @Schema(description = "职系编码")
    private String gradeCode;
    /**
     * 职系名称
     */
    @Schema(description = "职系名称")
    private String gradeName;
    /**
     * 职系英文名称
     */
    @Schema(description = "职系英文名称")
    private String gradeNameEn;
    /**
     * 职系描述
     */
    @Schema(description = "职系描述")
    private String gradeRemark;
    /**
     * 职系英文描述
     */
    @Schema(description = "职系英文描述")
    private String gradeRemarkEn;
    /**
     * 显示顺序
     */
    @Schema(description = "显示顺序")
    private Integer sort;
    /**
     * 是否启用（0停用 1启用）
     */
    @Schema(description = "是否启用（0停用 1启用）")
    private Integer status;
    /**
     * 是否删除（0正常 1删除）
     */
    @Schema(description = "是否删除（0正常 1删除）")
    private Integer deleted;
    /**
     * 乐观锁
     */
    @Schema(description = "乐观锁")
    private Integer revision;
    /**
     * 部门租户ID
     */
    @Schema(description = "部门租户ID")
    private String deptTenantId;
    /**
     * 公司租户ID
     */
    @Schema(description = "公司租户ID")
    private String companyTenantId;
    /**
     * 创建人
     */
    @Schema(description = "创建人")
    private String createdBy;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "创建时间")
    private LocalDateTime createdAt;
    /**
     * 更新人
     */
    @Schema(description = "更新人")
    private String updatedBy;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "更新时间")
    private LocalDateTime updatedAt;

}
