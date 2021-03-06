package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAgentAduitLog<M extends BaseAgentAduitLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setAgentId(java.lang.Long agentId) {
		set("agent_id", agentId);
	}

	public java.lang.Long getAgentId() {
		return get("agent_id");
	}

	public void setAduitOpter(java.lang.Long aduitOpter) {
		set("aduit_opter", aduitOpter);
	}

	public java.lang.Long getAduitOpter() {
		return get("aduit_opter");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return get("status");
	}

	public void setActive(java.lang.Boolean active) {
		set("active", active);
	}

	public java.lang.Boolean getActive() {
		return get("active");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setUpdated(java.util.Date updated) {
		set("updated", updated);
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}
