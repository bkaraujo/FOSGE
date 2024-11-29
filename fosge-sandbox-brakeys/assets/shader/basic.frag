#version 330 core
out vec4 FragColor;

in vec2 vtx_uv;

uniform sampler2D un_texture;

void main() {
    FragColor = texture(un_texture, vtx_uv);
}
