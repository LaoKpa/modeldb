import User from '../models/User';
import { IAuthenticationService } from './IAuthenticationService';

export default class MockAuthenticationService implements IAuthenticationService {
  private user: User;

  constructor() {
    this.user = new User(1, 'user');
  }

  public authenticate() {
    return this.user;
  }
}
