/**
 * 
 */
package org.hamster.weixinmp.dao.entity.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseItemMediaEntity;

/**
 * @author grossopaforever@gmail.com
 * @version Dec 29, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "item_video")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class WxItemVideoEntity extends WxBaseItemMediaEntity {
	@Column(name = "media_id", length = WxConfig.COL_LEN_INDICATOR, nullable = true)
	private String mediaId;
	@Column(name = "title", length = WxConfig.COL_LEN_TITLE, nullable = true)
	private String title;
	@Column(name = "description", length = WxConfig.COL_LEN_CONTENT, nullable = true)
	private String description;
	@ManyToOne
	@JoinColumn(name = "thumb_id", nullable = true)
	WxItemThumbEntity thumb;
}
