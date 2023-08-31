package com.innowise.educationalsystem.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserHavePermissionsResponseDto {
    private String userId;

    private String email;

    private boolean havingRequestedPermissions;
}
