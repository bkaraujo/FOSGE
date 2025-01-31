#shader vertex
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
#shader fragment
#version 330 core
out vec4 FragColor;

in vec2 vtx_uv;

uniform sampler2D   un_texture;
//uniform vec3        un_color;

void main() {
    FragColor = texture(un_texture, vtx_uv);
//    FragColor = vec4(un_color, 1.0) * texture(un_texture, vtx_uv);
}
