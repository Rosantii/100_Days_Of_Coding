#include <stdio.h>
#include <graphics.h>

void drawLineDDA(int x1, int y1, int x2, int y2) {
    int dx, dy, steps, k;
    float xIncrement, yIncrement, x, y;

    // Hitung perubahan x dan y
    dx = x2 - x1;
    dy = y2 - y1;

    // Tentukan langkah maksimum
    if (abs(dx) > abs(dy)) {
        steps = abs(dx);
    } else {
        steps = abs(dy);
    }

    // Hitung inkremen x dan y
    xIncrement = (float)dx / (float)steps;
    yIncrement = (float)dy / (float)steps;

    x = x1;
    y = y1;

    // Gambar setiap titik pada garis
    for (k = 0; k < steps; k++) {
        putpixel(round(x), round(y), WHITE);
        x += xIncrement;
        y += yIncrement;
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\Dev-Cpp\\MinGW64\\lib\\libbgi.a");

    int x1, y1, x2, y2;
    
    printf("Masukkan koordinat titik awal (x1, y1): ");
    scanf("%d %d", &x1, &y1);
    
    printf("Masukkan koordinat titik akhir (x2, y2): ");
    scanf("%d %d", &x2, &y2);

    drawLineDDA(x1, y1, x2, y2);

    delay(5000);
    closegraph();

    return 0;
}
