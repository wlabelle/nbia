package gov.nih.nci.nbia.dto;

import java.util.Set;

public class ImgObsCharacteristicQuantificationDTO {

	public ImgObsCharacteristicQuantificationDTO(String name,
			                                     String type,
			                                     Set<String> possibleValues) {
		super();
		this.name = name;
		this.type = type;
		this.possibleValues = possibleValues;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public Set<String> getPossibleValues() {
		return possibleValues;
	}

	private String name;

	private String type;

	private Set<String> possibleValues;

}
