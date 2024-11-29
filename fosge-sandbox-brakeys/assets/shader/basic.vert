#version 330 core

layout (location = 0) in vec3 in_position;
layout (location = 1) in vec2 in_uv;

out vec2 vtx_uv;

uniform mat4 un_model;
uniform mat4 un_viewProjection;

void main() {
    gl_Position = un_model * un_viewProjection * vec4(in_position, 1.0);
    vtx_uv = in_uv;
}
