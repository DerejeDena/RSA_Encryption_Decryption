Project Features:
User Interface: A simple command-line interface or GUI that allows users to:
    Input plaintext for encryption.
    View the encrypted ciphertext.
    Input ciphertext for decryption.
    View the decrypted plaintext.
Key Management: 
    Users can generate new public/private key pairs or use existing keys for encryption and decryption.
Error Handling: 
    The system should handle incorrect inputs, such as mismatched keys or unsupported message formats, gracefully.
Challenges and Solutions:
    Prime Number Generation: 
          Efficient generation of large prime numbers is crucial for key security. Implement algorithms like the Miller-Rabin primality test to ensure the prime numbers used are secure.
    Performance Optimization: 
          RSA encryption can be computationally intensive, especially for large messages. Consider optimizing the code for performance, such as using modular exponentiation to speed up calculations.
