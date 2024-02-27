import pygame

pygame.init()

display = pygame.display.set_mode((500, 500))


clock = pygame.time.Clock()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
            pygame.quit()
            exit()
    
    display.fill((200, 200, 200))
    pygame.display.update()
