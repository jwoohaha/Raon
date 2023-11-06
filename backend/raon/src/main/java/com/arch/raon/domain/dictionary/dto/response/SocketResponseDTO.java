package com.arch.raon.domain.dictionary.dto.response;

import java.io.Serializable;

public class SocketResponseDTO implements Serializable {
	private String nickname;
	private String roomId;
	private boolean isOwner;
	private String message;

	public SocketResponseDTO(String nickname, String roomId, String message, boolean isOwner) {
		this.nickname = nickname;
		this.roomId = roomId;
		this.message = message;
		this.isOwner = isOwner;
	}

	public SocketResponseDTO(String nickname, String message, boolean isOwner) {
		this.nickname = nickname;
		this.isOwner = isOwner;
		this.message = message;
	}

	public SocketResponseDTO() {
		super();
	}

	public String getNickname() {
		return nickname;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public boolean isOwner() {
		return isOwner;
	}

	public void setOwner(boolean owner) {
		isOwner = owner;
	}
}
